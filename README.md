# Polydoctor

## Description

## Installation

```sh
git clone https://github.com/rostro15/TD2-MiseEnProd-gradle.git
cd TD2-MiseEnProd-gradle
```

### build en local

```sh
./gradlew build
```

>le fichier se trouve est genéré ici `./build/libs/covid-api-0.0.1-SNAPSHOT.jar`

### demarage via docker en local avec le frontend

```sh
git clone https://github.com/rostro15/TD2-MiseEnProd-frontend
docker compose up -d
```

>le téléchargement des paquets node peut être long avec une mauvaise connexion

le site est accessible ici <http://localhost:4200/>
avec 3 compte existant :
| username   | mdp       | role                 |
|------------|-----------|----------------------|
| doctor     | doctormdp | docteur              |
| admin      | doctormdp | administrateur       |
| superadmin | doctormdp | super administrateur |

### demarage via docker en local sans le frontend

```sh
docker compose -f docker-compose-no-front.yaml up -d
```

>l'api est accessible ici <http://localhost:8080/>

### automatisation de la mise a jour de l'image via Jenkins

```groovy
node {
    def dockerImageBack
    def dockerImageFront
    
        stage('Build back') {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/rostro15/TD2-MiseEnProd-gradle'
                dockerdockerImageBackImage = docker.build("rostro15/mise_en_prod_td2_graddle")
        }

        stage('Build front') {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/rostro15/TD2-MiseEnProd-frontend'
                dockerImageFront = docker.build("rostro15/mise_en_prod_td2_frontend")
        }
                
        stage('Deploy image'){
                docker.withRegistry('https://registry.hub.docker.com', 'cred-docker-hub') {
                    dockerImageBack.push('latest')
                    dockerImageFront.push('latest')
                }
        }
}
```

>lien de l'image sur docker hub <https://hub.docker.com/repository/docker/heatsinkru/polydoctor-backend/general>

## test du fonctionnement

 <http://localhost:8080/public/centers> doit retourner un JSON

## Authors and acknowledgment

`Samuel DITTE-DESTRÉE`
`Theo RUSINOWITCH`
`Lucie GARNIER`
