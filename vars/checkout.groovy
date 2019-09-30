def call(gitlab,branch_name) {
 withCredentials([string(credentialsId: 'gitlaburl', variable: 'gitlab')]) {
                echo "My password is '${gitlab}'!"
                checkout([$class: 'GitSCM',
                branches: [[name: 'origin/master']],
                extensions: [[$class: 'WipeWorkspace']],
                userRemoteConfigs: [[url: "${gitlab}"]]
                ])
                }


