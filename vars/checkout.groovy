def call(git_url,branch_name) {
 echo "My git url is ${git_url}"
     echo "Checkout from branch ${branch_name}"
     checkout([$class: 'GitSCM',
                 branches: [[name: "origin/${branch_name}"]],
                 extensions: [[$class: 'WipeWorkspace']],
                 userRemoteConfigs: [[url: "${git_url}"]]

                ])
                
}


