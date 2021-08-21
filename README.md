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

| Cas de test     | Classe                                                                                            | Description                                                                          |
|-----------------|---------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------|
| AlertTests      |[AlertPage](https://github.com/amine784/test-suite/blob/main/captureTest/1-captureTestalert.png)   |                                                                                      |
| FileUploadTests |[FileUploadPage](https://github.com/amine784/test-suite/blob/main/captureTest/fileUpload.png)      | on va uploader un fichier                          					                 |		                                                            
| FramesTests     |[FramesPage](https://github.com/amine784/test-suite/blob/main/captureTest/3-frameTest.png)         | Main page body.                                                                      |
| HoverTests      |[HoversPage](https://github.com/amine784/test-suite/blob/main/captureTest/4-hoverTest.png)         | A4 page size; useful when producing pages where printing is high priority (e.g. a    |
| KeyTests        |[KeyPressesPage](https://github.com/amine784/test-suite/blob/main/captureTest/5-keyTest.png)       | U.S. letter page size.                                                               |
| LoginTests      |[LoginPage](https://github.com/amine784/test-suite/blob/main/captureTest/login.png)                | Put a pre, table, or figure element over the full width of a .page, including marg   |
| NavigationTests |[NavigationPage](https://github.com/amine784/test-suite/blob/main/captureTest/7-navigationTest.png)| Add a border around figure elements.                                                 |
| WaitTests.java  |[WaitPage](https://github.com/amine784/test-suite/blob/main/captureTest/8-waitTest.png)            | Format as a link; mainly for buttons, since regular links can't do POST requests.    |
                            



### Related values (“variables”)

There are a number of variables you can define, they are included at the top of
`base.css`.

TODO:

| Name           | Description                               | Default                            |
| -------------- | ----------------------------------------- | ---------------------------------- |
| --font         | The main font.                            | 16px/180% 'Libre Baskerville' (..) |
| --width-body   | Width of main body text                   | 54rem                              |
| --pad-x        | Padding to the side of the body           | 4rem                               |
| --pad-y        | Padding to the top and bottom of the body | 4rem                               |
| --color-bg     | Background colour of main body text       | #fff                               |
| --color-text   | Colour of main body text                  | #252525                            |
| --color-border | Border colour for table, fieldset, input  | #aaa                               |


