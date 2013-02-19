
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object pecas extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Form[entidades.Peca],List[entidades.Peca],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(user: String, pForm: Form[entidades.Peca], pecas: List[entidades.Peca]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Lista de Pecas")/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""

    <h1>"""),_display_(Seq[Any](/*7.10*/user)),format.raw/*7.14*/(""", temos """),_display_(Seq[Any](/*7.23*/pecas/*7.28*/.size())),format.raw/*7.35*/(""" pecas no sistema.</h1>
    <ul>
        """),_display_(Seq[Any](/*9.10*/for(peca <- pecas) yield /*9.28*/ {_display_(Seq[Any](format.raw/*9.30*/("""
            <li>
		"""),_display_(Seq[Any](/*11.4*/peca/*11.8*/.toString())),format.raw/*11.19*/("""
            </li>
        """)))})),format.raw/*13.10*/("""
    </ul>

	"""),_display_(Seq[Any](/*16.3*/helper/*16.9*/.form(action = routes.Application.novaPeca())/*16.54*/{_display_(Seq[Any](format.raw/*16.55*/("""
		
		<h2><a href="novaPeca">Adicionar nova Peca</a></h2>
	""")))})),format.raw/*19.3*/("""

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(user:String,pForm:Form[entidades.Peca],pecas:List[entidades.Peca]): play.api.templates.Html = apply(user,pForm,pecas)
    
    def f:((String,Form[entidades.Peca],List[entidades.Peca]) => play.api.templates.Html) = (user,pForm,pecas) => apply(user,pForm,pecas)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 19 09:31:27 BRT 2013
                    SOURCE: /home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/app/views/pecas.scala.html
                    HASH: c758d0e5c29a5c6abba09e7b9e79d70bc5657b90
                    MATRIX: 765->1|930->73|958->92|994->94|1024->116|1063->118|1109->129|1134->133|1178->142|1191->147|1219->154|1296->196|1329->214|1368->216|1424->237|1436->241|1469->252|1529->280|1578->294|1592->300|1646->345|1685->346|1776->406|1810->409
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|35->7|35->7|37->9|37->9|37->9|39->11|39->11|39->11|41->13|44->16|44->16|44->16|44->16|47->19|49->21
                    -- GENERATED --
                */
            