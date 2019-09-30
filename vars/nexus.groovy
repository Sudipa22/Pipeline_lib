def call(nexus,nexus_targetURL,artifact)
{
withCredentials([usernamePassword(credentialsId: "${nexus}", passwordVariable: 'pass', usernameVariable: 'usr')]){
                sh label: '', script: "curl -u ${usr}:${pass} --upload-file target/${artifact} ${nexus_targetURL};"
              }
          }
