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

### demarage via docker en local

```sh
docker compose up -d
```

>le site est accessible ici <http://localhost:8080/>


### automatisation de la mise a jour de l'image via Jenkins

```groovy
node {
    def dockerImage
    
        stage('Build') {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/rostro15/TD2-MiseEnProd-gradle'
                dockerImage = docker.build("rostro15/mise_en_prod_td2_graddle")
        }
                
        stage('Deploy Image'){
                docker.withRegistry('https://registry.hub.docker.com', 'cred-docker-hub') {
                    dockerImage.push('latest')
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