
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
object lista extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[entidades.Computador],Form[entidades.Computador],String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(computadores: List[entidades.Computador], computadorForm: Form[entidades.Computador], user: String):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Lista de Computadores")/*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/computadores/*7.22*/.size())),format.raw/*7.29*/(""" computador(es)</h1>
		"""),_display_(Seq[Any](/*8.4*/user)),format.raw/*8.8*/("""
    <ul>
        """),_display_(Seq[Any](/*10.10*/for(computador <- computadores) yield /*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/computador/*12.28*/.barcode)),format.raw/*12.36*/("""
                
                """),_display_(Seq[Any](/*14.18*/form(routes.Application.deleteComputador(computador.id))/*14.74*/ {_display_(Seq[Any](format.raw/*14.76*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*16.18*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>
    
    <h2>Adicionar novo computador</h2>
    
    """),_display_(Seq[Any](/*23.6*/form(routes.Application.newComputador())/*23.46*/ {_display_(Seq[Any](format.raw/*23.48*/("""
        
        """),_display_(Seq[Any](/*25.10*/inputText(computadorForm("barcode")))),format.raw/*25.46*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*29.6*/("""
    
""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(computadores:List[entidades.Computador],computadorForm:Form[entidades.Computador],user:String): play.api.templates.Html = apply(computadores,computadorForm,user)
    
    def f:((List[entidades.Computador],Form[entidades.Computador],String) => play.api.templates.Html) = (computadores,computadorForm,user) => apply(computadores,computadorForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Feb 19 09:31:28 BRT 2013
                    SOURCE: /home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/app/views/lista.scala.html
                    HASH: 9d8f44922788fc2dcff4f21280f3ae9ec5972bbf
                    MATRIX: 777->1|971->101|999->120|1035->122|1072->151|1111->153|1161->168|1181->180|1209->187|1267->211|1291->215|1346->234|1393->265|1433->267|1504->302|1523->312|1553->320|1624->355|1689->411|1729->413|1836->488|1896->516|1996->581|2045->621|2085->623|2140->642|2198->678|2299->748|2337->755
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|36->8|36->8|38->10|38->10|38->10|40->12|40->12|40->12|42->14|42->14|42->14|44->16|46->18|51->23|51->23|51->23|53->25|53->25|57->29|59->31
                    -- GENERATED --
                */
            