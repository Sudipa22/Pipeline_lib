def call(nexus,artifact,nexus_targetURL)
{
withCredentials([usernamePassword(credentialsId: "${nexus}", passwordVariable: 'pass', usernameVariable: 'usr')]){
                sh label: '', script: "curl -u ${usr}:${pass} --upload-file ${artifact} ${nexus_targetURL};"
              }
          }
