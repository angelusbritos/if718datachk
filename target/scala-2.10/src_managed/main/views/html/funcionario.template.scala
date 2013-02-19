
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
object funcionario extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Login")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    
    <h1>Sistema DataCHK</h1>

    
    <h2>N&atilde;o &eacute; cadastrado? <a href="">Click Aqui</a>.</h2>
""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render(): play.api.templates.Html = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 19 09:31:27 BRT 2013
                    SOURCE: /home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/app/views/funcionario.scala.html
                    HASH: 715ef48ec17291c4db685dc18806088e26c246eb
                    MATRIX: 809->17|845->19|866->32|905->34|1049->148
                    LINES: 30->2|31->3|31->3|31->3|37->9
                    -- GENERATED --
                */
            