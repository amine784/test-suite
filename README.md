 Implémentation des tests avec Selenium && Java!
===========

Afin de maitriser Selenium et le langage JAVA, j'ai effectué une liste de tests sur plusieurs aplications pour tester des fonctions bien déterminées (s'authentifier,
appuyer sur des boutons, cliquer sur un dropdownn, scroller jusqu'à la fin de la page, etc.. )
Pour démarrer, j'ai suivi un tuto pour apprendre les "best practices" de test et pour mieux concevoir la conception des tests et la division des fichiers.

Les étapes suivies sont ci-dessous: 
-----------------------------------------------------


<ul> 
    <li>Créer un projet avec Maven pour générer les dépendences et pour le build du projet aussi.</li>
    <li>Configurer le fichier pom.xml pour ajouter toutes les dépendences.</li>
    <li> Diviser le projet en deux grandes parties Main & Test.</li>
    <li> Gérer l'exécution de tous ces tests (expulsion ,organisation) avec un fichier .xml puis générer un rapport.  </li>
<ul/>


La structure de projet  : 
-----------------------------------------------------
J'ai utilisé dans ce projet le design pattern Page Object Model(POM). Il fonctionne comme suit:<br />
Je crée une classe dans la section Main du projet qui représente une page de l'application. Pour chaque page de l'application, je crée une nouvelle classe (AlertPage,LoginPage) dans la section et dans le dossier test, on crée les classes de test.

![hello-theme](https://github.com/amine784/test-suite/blob/main/captureTest/pom2.png)

### Les cas de test:

| Cas de test     | Classe                                                                                            | Description des cas de test                                                                                                                                                    |
|-----------------|---------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| AlertTests      |[AlertPage](https://github.com/amine784/test-suite/blob/main/captureTest/1-captureTestalert.png)   | dans ce cas de test, on va tester un bouton, un PopUp et enfin un prompt.  On clique sur le button desiré et on teste si le resultat est conforme au cahier des charges        |
| FileUploadTests |[FileUploadPage](https://github.com/amine784/test-suite/blob/main/captureTest/fileUpload.png)      | on va essayer d'uploader un fichier.  		                                                                                                                                   |     
| FramesTests     |[WysiwygEditorPage](https://github.com/amine784/test-suite/blob/main/captureTest/3-frameTest.png)  | test des frames dans une page par la récuperation, ou ecriture des  mots .                                                                                                      |
| HoverTests      |[HoversPage](https://github.com/amine784/test-suite/blob/main/captureTest/4-hoverTest.png)         | on va mettre le courseur sur une image et on va lire  le text affiché.                                                                                                         |
| KeyTests        |[KeyPressesPage](https://github.com/amine784/test-suite/blob/main/captureTest/5-keyTest.png)       | on va entrer des key pour dans un champs.                                                                                                                                      |                                                                                                                                   
| LoginTests      |[LoginPage](https://github.com/amine784/test-suite/blob/main/captureTest/login.png)                | on va tester l'authentification puis le logOut                                                                                                                                 |
| NavigationTests |[NavigationPage](https://github.com/amine784/test-suite/blob/main/captureTest/7-navigationTest.png)| on va naviguer entre les onglets                                                                                                                                               |
| WaitTests.java  |[WaitPage](https://github.com/amine784/test-suite/blob/main/captureTest/8-waitTest.png)            | on va cliquer sur un bouton, on attend puis on va lire le résultat.                                                                                                            |                                                                                                             |
                            



### Generation  d'un rapport de test
Après l'exécution de tous les tests on peut générer un rapport détaillé de tous les cas de tests(passeds, failed)a l'aide de selenium on peut
Générer deux types de rapport(failure rapport, and passed rapport) j'ai exécuté tous les tests dans ce avec en utilisant testNg avec un fichier .XML
![xml](https://github.com/amine784/test-suite/blob/main/captureTest/xmlfile.png) 

on obtient par la suite ce rapport de test :
![rapport](https://github.com/amine784/test-suite/blob/main/captureTest/repportGeneration.png) 


### test Manuel avec squash:
j'ai fait quelque cas de test manuellement avec squash mais je n'ai pas encore mis la documentation de cette partie(en cours)