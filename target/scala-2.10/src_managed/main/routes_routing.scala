// @SOURCE:/home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/conf/routes
// @HASH:3abcf0da2c3ee896433881472b3eb3912d791f61
// @DATE:Tue Feb 19 09:31:20 BRT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Application_logout2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:10
private[this] lazy val controllers_Application_funcionario3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("funcionario"))))
        

// @LINE:12
private[this] lazy val controllers_Application_pecas4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pecas"))))
        

// @LINE:13
private[this] lazy val controllers_Application_novaPeca5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("novaPeca"))))
        

// @LINE:15
private[this] lazy val controllers_Application_computadores6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computadores"))))
        

// @LINE:16
private[this] lazy val controllers_Application_newComputador7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computadores"))))
        

// @LINE:17
private[this] lazy val controllers_Application_deleteComputador8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("computadores/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """funcionario""","""controllers.Application.funcionario()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pecas""","""controllers.Application.pecas()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """novaPeca""","""controllers.Application.novaPeca()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computadores""","""controllers.Application.computadores()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computadores""","""controllers.Application.newComputador()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computadores/$id<[^/]+>/delete""","""controllers.Application.deleteComputador(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Application_logout2(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:10
case controllers_Application_funcionario3(params) => {
   call { 
        invokeHandler(controllers.Application.funcionario(), HandlerDef(this, "controllers.Application", "funcionario", Nil,"GET", """""", Routes.prefix + """funcionario"""))
   }
}
        

// @LINE:12
case controllers_Application_pecas4(params) => {
   call { 
        invokeHandler(controllers.Application.pecas(), HandlerDef(this, "controllers.Application", "pecas", Nil,"GET", """""", Routes.prefix + """pecas"""))
   }
}
        

// @LINE:13
case controllers_Application_novaPeca5(params) => {
   call { 
        invokeHandler(controllers.Application.novaPeca(), HandlerDef(this, "controllers.Application", "novaPeca", Nil,"GET", """""", Routes.prefix + """novaPeca"""))
   }
}
        

// @LINE:15
case controllers_Application_computadores6(params) => {
   call { 
        invokeHandler(controllers.Application.computadores(), HandlerDef(this, "controllers.Application", "computadores", Nil,"GET", """""", Routes.prefix + """computadores"""))
   }
}
        

// @LINE:16
case controllers_Application_newComputador7(params) => {
   call { 
        invokeHandler(controllers.Application.newComputador(), HandlerDef(this, "controllers.Application", "newComputador", Nil,"POST", """""", Routes.prefix + """computadores"""))
   }
}
        

// @LINE:17
case controllers_Application_deleteComputador8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.deleteComputador(id), HandlerDef(this, "controllers.Application", "deleteComputador", Seq(classOf[Long]),"POST", """""", Routes.prefix + """computadores/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:20
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        