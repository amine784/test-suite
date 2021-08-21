 Implémentation des tests avec Selenium && Java!
===========

Afin de maitriser Selenium et le langage JAVA, j'ai effectué une liste de tests sur plusieurs aplications pour tester des fonctions bien déterminées(authentificationn, 
appui sur des boutons,cliquer sur un dropdownn, scroller jusqu'à la fin de la page, etc.. )
Pour démarrer, j'ai suivi un tuto pour apprendre les "best practices" de test et pour mieux concevoir la conception des tests et la division des fichiers..

Les étapes suivies sont ci-dessous: 
-----------------------------------------------------


<ul> 
    <li> Créer un projet avec Maven pour générer les dépendences et pour le build du projet aussi.</li>
    <li> Configurer le fichier pom.xml pour ajouter toutes les dépendences.</li>
    <li> Diviser le projet en deux grandes parties Main & Test :  </li>
    <li> gerer l'execution de tout ces tests(expulsion ,organisation) avec un fichier .xml et generation d'un rapport  </li>
<ul/>


La structure de projet  : 
-----------------------------------------------------
j'ai utilisé dans ce projet le design pattern Page Object Model(POM).il fonctionne comme suit:<br />
je cree une classe dans la section main du projet qui représente une page de l'application et pour chaque page de l'application, je crée une nouvelle classe(AlertPage,LoginPage) dans la section et dans le dossier test on cree les classe de tests.

![hello-theme](https://github.com/amine784/test-suite/blob/main/captureTest/pom2.png)

### Les cas de test:

| Cas de test     | Classe                                                                                            | Description des cas de test                                                                                         |
|-----------------|---------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| AlertTests      |[AlertPage](https://github.com/amine784/test-suite/blob/main/captureTest/1-captureTestalert.png)   | dans ce cas de test on va tester un boutton ,un PopUp et enfin un prompt "                                          |
| FileUploadTests |[FileUploadPage](https://github.com/amine784/test-suite/blob/main/captureTest/fileUpload.png)      | on va essayer uploader un fichier puis on recupere son titre pour etre sure que le fichier est uploader avec succés |		                                                             
| FramesTests     |[FramesPage](https://github.com/amine784/test-suite/blob/main/captureTest/3-frameTest.png)         | tests des frames dans une page par la recuperation,ou ecriture des  mots .                                          |
| HoverTests      |[HoversPage](https://github.com/amine784/test-suite/blob/main/captureTest/4-hoverTest.png)         | on va mettre le courseur sur une image et on va lire  le text affiché.                                              |
| KeyTests        |[KeyPressesPage](https://github.com/amine784/test-suite/blob/main/captureTest/5-keyTest.png)       |                                                                                                                     |
| LoginTests      |[LoginPage](https://github.com/amine784/test-suite/blob/main/captureTest/login.png)                | on va essayé dans ce cas de test l'authentification puis le logOut                                                  |
| NavigationTests |[NavigationPage](https://github.com/amine784/test-suite/blob/main/captureTest/7-navigationTest.png)|                                                                                                                     |
| WaitTests.java  |[WaitPage](https://github.com/amine784/test-suite/blob/main/captureTest/8-waitTest.png)            |                                                                                                                     |
                            



### Generation  d'un rapport de test
Apres l'execution de tout les tests on peut generer un rapport detaille des tout les cas de test(passed,failed)a l'aide de Selenium on peut
generer deux type de rapport(failure rapport,and passed rapport)
j'ai execute tout les test dans ce avec en utilisant testNG avec un fichier .xml
![xml](https://github.com/amine784/test-suite/blob/main/captureTest/xmlfile.png) 

on obtient par la suite ce rapport de test :
![rapport](https://github.com/amine784/test-suite/blob/main/captureTest/repportGeneration.png) 


### test Manuel avec squash:
dans cette partie je vais choisir quelques test pour les tester manuellement vu qu"on peut pas automatiser tout les taches,
je vais prendre quelques test simple pour avoir une idee sur les test manuels comment ca se passe