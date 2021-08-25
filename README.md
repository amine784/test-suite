 Implémentation des tests avec Selenium & Java!
===========

Afin de maitriser Selenium et le langage JAVA, j'ai effectué une liste de tests sur plusieurs aplications pour tester des fonctions bien déterminées (s'authentifier,
appuyer sur des boutons, cliquer sur un dropdownn, scroller jusqu'à la fin de la page, etc.. )
Pour démarrer, j'ai suivi un tuto pour apprendre les "best practices" de test et pour mieux concevoir la conception des tests et la division des fichiers.

Les étapes suivies: 
-----------------------------------------------------


<ul> 
    <li>Créer un projet avec Maven pour générer les dépendences et pour le build du projet aussi.</li>
    <li>Configurer le fichier pom.xml pour ajouter toutes les dépendences.</li>
    <li> Diviser le projet en deux grandes parties Main & Test.</li>
    <li> Gérer l'exécution de tous ces tests (expulsion ,organisation) avec un fichier .xml puis générer un rapport.  </li>
<ul/>


La structure du projet  : 
-----------------------------------------------------
J'ai utilisé dans ce projet le design pattern Page Object Model(POM). Il fonctionne comme suit:<br />
Je crée une classe dans la section Main du projet qui représente une page de l'application. Pour chaque page de l'application, je crée une nouvelle classe (AlertPage,LoginPage) dans la section et dans le dossier test, je crée les classes de test.

![hello-theme](https://github.com/amine784/test-suite/blob/main/captureTest/pom2.png)

### Les cas de test:

| Cas de test     | Classe                                                                                            | Description des cas de test                                                                                                                                                    |
|-----------------|---------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| AlertTests      |[AlertPage](https://github.com/amine784/test-suite/blob/main/captureTest/1-captureTestalert.png)   | Tester un bouton, un PopUp et enfin un prompt.  On clique sur le bouton désiré et on teste si le résultat est conforme au cahier des charges.        |
| FileUploadTests |[FileUploadPage](https://github.com/amine784/test-suite/blob/main/captureTest/fileUpload.png)      | Tester l'upload d'un fichier.  		                                                                                                                                   |     
| FramesTests     |[WysiwygEditorPage](https://github.com/amine784/test-suite/blob/main/captureTest/3-frameTest.png)  | Tester les frames dans une page par la récuperation ou la saisie de texte.                                                                                                      |
| HoverTests      |[HoversPage](https://github.com/amine784/test-suite/blob/main/captureTest/4-hoverTest.png)         | Mettre le curseur sur une image et lire  le texte affiché.                                                                                                         |
| KeyTests        |[KeyPressesPage](https://github.com/amine784/test-suite/blob/main/captureTest/5-keyTest.png)       | Entrer des key dans un champs.                                                                                                                                      |                                                                                                                                   
| LoginTests      |[LoginPage](https://github.com/amine784/test-suite/blob/main/captureTest/login.png)                | Tester l'authentification puis le logOut.                                                                                                                                |
| NavigationTests |[NavigationPage](https://github.com/amine784/test-suite/blob/main/captureTest/7-navigationTest.png)| Tester la navigation entre les onglets.                                                                                                                                             |
| WaitTests.java  |[WaitPage](https://github.com/amine784/test-suite/blob/main/captureTest/8-waitTest.png)            | Cliquer sur un bouton, attendre puis lire le résultat.                                                                                                            |                                                                                                             |
                            



### Génération  d'un rapport de test
 Après l'execution de tous les tests, un rapport détaillé est généré comportant tous les cas de test (passed, failed). A l'aide de Selenium, on peut
générer deux types de rapports (failure report et passed report)
J'ai exécuté tous les tests en utilisant testNG avec un fichier .xml.
![xml](https://github.com/amine784/test-suite/blob/main/captureTest/xmlfile.png) 

On obtient par la suite ce rapport de test :
![rapport](https://github.com/amine784/test-suite/blob/main/captureTest/repportGeneration.png) 


### Test manuel avec squash:
j'ai fait quelques cas de test manuellement avec squash et je n'ai pas encore mis la documentation de cette partie.
