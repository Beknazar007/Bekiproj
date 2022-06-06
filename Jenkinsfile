@Library('shared-library') _
pipeline {
    agent any

    stages {
        stage('HelloWorld') {
            steps {
                HelloWorld()


            }
        }
        stage('Alik') {
            steps {

                Alik()

            }
        }
        stage('String name surname') {
            steps {


                NS("Beknazar","Saittegin")
            }
        }
        stage('Map config') {
            steps {


                mapconfig(surname:"Saittegin",name:"Beknazar")
            }
        }
        stage('Send email'){
        steps{
            sendemail(body:"beknazar",subject: "it is sendemail with smtp server \n Assalam Aleikum")
        }
        }
    }
}