
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
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[entidades.Funcionario],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(funcionarioForm: Form[entidades.Funcionario]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.48*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Login")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""
    
    <h1>Sistema DataCHK</h1>

	"""),_display_(Seq[Any](/*9.3*/helper/*9.9*/.form(action = routes.Application.login())/*9.51*/ {_display_(Seq[Any](format.raw/*9.53*/("""
		"""),_display_(Seq[Any](/*10.4*/funcionarioForm/*10.19*/.errors())),format.raw/*10.28*/("""	
		"""),_display_(Seq[Any](/*11.4*/helper/*11.10*/.inputText(funcionarioForm("email")))),format.raw/*11.46*/("""
		"""),_display_(Seq[Any](/*12.4*/helper/*12.10*/.inputPassword(funcionarioForm("password")))),format.raw/*12.53*/("""
		<input type="submit" value="Entrar">
	""")))})),format.raw/*14.3*/("""
    
    <h2>N&atilde;o &eacute; cadastrado? <a href="">Click Aqui</a>.</h2>
""")))})),format.raw/*17.2*/("""
"""))}
    }
    
    def render(funcionarioForm:Form[entidades.Funcionario]): play.api.templates.Html = apply(funcionarioForm)
    
    def f:((Form[entidades.Funcionario]) => play.api.templates.Html) = (funcionarioForm) => apply(funcionarioForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 19 09:31:27 BRT 2013
                    SOURCE: /home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/app/views/login.scala.html
                    HASH: 41633b2af3094079ca0e8ed7498b6d2251395db4
                    MATRIX: 744->1|883->47|911->66|947->68|968->81|1007->83|1079->121|1092->127|1142->169|1181->171|1220->175|1244->190|1275->199|1315->204|1330->210|1388->246|1427->250|1442->256|1507->299|1580->341|1690->420
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|42->14|45->17
                    -- GENERATED --
                */
            