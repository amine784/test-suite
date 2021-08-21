
<br />
  <h1 align="center">implementation des tests avec Selenium && Java</h1>
</p>

<br/>


## -Presentation de ce Reposotory 
<br />
Afin de maitriser Selinium et le langage java j'ai effectuer une lsite de test sur plusieurs aplication pour tester des fonctions bien determiné(authentificationn apui sur des button,cliquer sur un dropdownn,scroller jusqu'a la fin de page etc.. )
pour debuter j'ai suivi un tuto pour apprendre les "best practices" de test et pour mieux concevoir la conception des tests et la devision des fichier.
<br /><br />

Les etapes suivi sont ci-dessous: <br/>
<ul> 
    <li> 1-creer un projet avec Maven pour qu'il nous generenet les dependences et pour le build de projet aussi.</li>
    <li>2-configurer le fichier pom.xml pour ajouter tout les dependences.</li>
    <li>3-deviser le projet en deux grande partie Main & Test :.</li>
    <li>
      <ul>
          <li>
              <br />
              3-1 Dossier Main doit contenir les secenario de test(par exemple j'ai fait un LoginPage pour capter les champs a remplir et les button a utiliser a l'aide des classe css ou egalement avec les xPath et et l'implementation des methodes a utiliser par exemple 
             j'ai creer un methode pour remplir le champ mot de passe "setPasswordField").
             <br />
          </li>
          <li>
            3-2  Dossier Test doit contenir les test a effectuer par exemple dans la classe Login faut decrire les pas de tes a faire
            par exmple dans le cas de test d'authentification on on click sur le button pour qu'il nous affiche les champs a remplir 
            puis on rempli les champ et chaque pas  en realite est une methode(declarer dans le dossier Main) et pour faciliter  et organiser les tests j'ai fais des objets standard comme home page et je l'appele dans chaque test pour eviter le redondance de code.
            Pour finir pour mieux organiser le travail faut que je cree un dossier qui s'appele "base" pour mettre dedans  les methodes a executer avant/apres methodes ou classe ces methodes ils vont etre executer  dans n'importe quel test.
          </li>
     </ul>
  <li>4-je peux gerer l'execution de tout ces tests(expulsion ,organisation) avec un fichier .
            xml (partie manquante dans ce projet</li>
</ul>
 
  

  


<!-- ROADMAP -->
## test Login de  l'application :
<br />
on va tester si l'authentification suit l'exigence decrite par le cahier de charge sinon on genere un bug:

![alt text](https://github.com/amine784/test-suite/blob/main/captureTest/login.png) 


<br><br/>
Apres l'execution de test on constate que dans le terminal que le test est passé <br />
<br><br/>

![alt text](https://github.com/amine784/test-suite/blob/main/captureTest/6-loginTest.png) 


<br />
 pour le test suivant on va tester si le FileUploading de l'application: <br />

![alt text](https://github.com/amine784/test-suite/blob/main/captureTest/fileUpload.png)

<br><br/>
Apres l'execution de test le fichier a ete bien uploader test passed l'astuce de test consite a comparer le titre de fichier uploader avec celle qu'on as uploader <br />
<br><br/>

![alt text](https://github.com/amine784/test-suite/blob/main/captureTest/1-2capture-uploadFile.png)








<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

