def call(playbook)
{
sh "cd /home/ubuntu && ls -al && ansible-playbook -i inventory ${playbook}"
}
