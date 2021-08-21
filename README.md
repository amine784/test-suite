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
j'ai utilisé dans ce projet le design pattern Page Object Model(POM).il fonctionne comme suit:
je cree une classe dans la section main du projet qui représente une page de l'application et pour chaque page de l'application, je crée une nouvelle classe(AlertPage,LoginPage) dans la section et dans le dossier test on cree les classe de tests.

[hello-theme](https://github.com/amine784/test-suite/blob/main/captureTest/pom2.png)

### Les cas de test:

| Class        | File           | Purpose                                                                                |
| ------------ | -------------- | -------------------------------------------------------------------------------------- |
| .center      | base.css       | Center-align the main content.                                                         |
| .page        | base.css       | Main page body.                                                                        |
| .page-a4     | base.css       | A4 page size; useful when producing pages where printing is high priority (e.g. a CV). |
| .page-letter | base.css       | U.S. letter page size.                                                                 |
| .full        | base.css       | Put a pre, table, or figure element over the full width of a .page, including margins. |
| .border      | base.css       | Add a border around figure elements.                                                   |
| .link        | base.css       | Format as a link; mainly for buttons, since regular links can't do POST requests.      |
| .left        | base.css       | Left-align a table cell.                                                               |
| .right       | base.css       | Right-align a table cell; the cell will also use tabular numbers for alignment.        |
| .postscript  | postscript.css | Page content; for e.g. footnotes or feedback section.                                  |
| .vertical    | form.css       | Layout the form vertically (labels above inputs).                                      |
| .horizontal  | form.css       | Layout the form horizontally (labels next to inputs).                                  |

### Included files

| File           | Description                                      |
| -------------- | ------------------------------------------------ |
| base.css       | Basic defaults; this is the bulk of the project. |
| form.css       | Forms, inputs, labels (WIP).                     |
| aside.css      | Content in margin.                               |
| blockquote.css | Decorative quotation marks around blockquote.    |
| postscript.css | P.S. content, such as footnotes.                 |
| permalink.css  | Permalink markers in headers.                    |

The `dist/` directory contains versions without extensive annotations, as well
as an `all.css` which contains all of the above files.

You can use the [singlepage](https://github.com/arp242/singlepage) tool to
inline CSS files in to a document with `<style>` tags.

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


See also
--------

- [hello-theme](https://bitbucket.org/jboy1/hello-theme/src/master/), a Pelican
  theme based on this (with a few changes).

Credits and license
-------------------

The [Libre Baskerville font](https://github.com/impallari/Libre-Baskerville) in
the fonts directory is distributed under the SIL Open Font License 1.1. See
[fonts/LICENSE](fonts/LICENSE).

The fleurons in the &lt;hr&gt; element are exports from the Deja-Vu font, which
is in the public domain.

<!--
<aside>In my country of The Netherlands it’s not clear if it’s possible to place works in the public domain,
	<a href="https://www.iusmentis.com/auteursrecht/publiekdomein/#plaatsen">see this article</a>.
</aside>
-->
Everything else is in the public domain. I renounce all copyright, and don’t
care what you do with it. Since this is not possible in all legal jurisdictions
I’ve also attached a modified copy of the ISC license which replaces the
attribution clause with the text “without any restrictions”:

	Copyright © Martin Tournoij

	Permission to use, copy, modify, and/or distribute this software for any purpose
	with or without fee is hereby granted, without any restrictions.

	THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
	REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND
	FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
	INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS
	OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
	TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
	THIS SOFTWARE.

---

Cross-platform testing made possible by
[BrowserStack](https://www.browserstack.com/), which provides free access for
open source projects.

[![](https://arp242.github.io/hello-css/.browserstack.svg)](https://www.browserstack.com/)

<!--
<div class="postscript">
	<strong>Footnotes</strong>
	<ol>
		<li id="fn-1"><p>In my view it’s often better to just copy/paste and modify things, especially when it’s not
			inherently complex (like CSS), rather than spending a lot of effort on making it generic, as making software
			more generic often comes at the price of increased complexity, maintains burden, and tend to make things
			<em>less</em> flexible overall.</p></li>
	</ol>
</div>
-->
