
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.1")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <a href="funcionario">Funcionario</a>
    <a href="computadores">Computadores</a>
    <a href="pecas">Pecas</a>
    <a href="">a</a>
    <a href="">a</a>
    <a href="">a</a>
    <a href="">a</a>
    """),_display_(Seq[Any](/*11.6*/play20/*11.12*/.welcome(message, style = "Java"))),format.raw/*11.45*/("""
    
""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 19 09:31:28 BRT 2013
                    SOURCE: /home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/app/views/index.scala.html
                    HASH: 57fb7f9796a6c6f82dd9b88cf5e2945976c28a8a
                    MATRIX: 723->1|817->18|854->21|889->48|928->50|1169->256|1184->262|1239->295|1277->302
                    LINES: 26->1|29->1|31->3|31->3|31->3|39->11|39->11|39->11|41->13
                    -- GENERATED --
                */
            