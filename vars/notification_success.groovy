def call()
{
slackSend (color: '#00FF00', message: "SUCCESSFUL: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]' (${env.BUILD_URL})")
emailext body: 'Build Success', recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: 'Test', to: 'sudipabehera24@gmail.com,papunpikun@gmail.com,threkashri@gmail.com'
}
   
