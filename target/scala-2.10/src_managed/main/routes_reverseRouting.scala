// @SOURCE:/home/asb/Desktop/test/play-2.1.0/workspace/if718datachk/conf/routes
// @HASH:3abcf0da2c3ee896433881472b3eb3912d791f61
// @DATE:Tue Feb 19 09:31:20 BRT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def pecas(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pecas")
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:13
def novaPeca(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "novaPeca")
}
                                                

// @LINE:16
def newComputador(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computadores")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def deleteComputador(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "computadores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:15
def computadores(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "computadores")
}
                                                

// @LINE:10
def funcionario(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "funcionario")
}
                                                
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def pecas : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pecas",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pecas"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:13
def novaPeca : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.novaPeca",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "novaPeca"})
      }
   """
)
                        

// @LINE:16
def newComputador : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newComputador",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computadores"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:17
def deleteComputador : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteComputador",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "computadores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:15
def computadores : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.computadores",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "computadores"})
      }
   """
)
                        

// @LINE:10
def funcionario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.funcionario",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "funcionario"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:20
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def pecas(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pecas(), HandlerDef(this, "controllers.Application", "pecas", Seq(), "GET", """""", _prefix + """pecas""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:8
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:13
def novaPeca(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.novaPeca(), HandlerDef(this, "controllers.Application", "novaPeca", Seq(), "GET", """""", _prefix + """novaPeca""")
)
                      

// @LINE:16
def newComputador(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newComputador(), HandlerDef(this, "controllers.Application", "newComputador", Seq(), "POST", """""", _prefix + """computadores""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:17
def deleteComputador(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteComputador(id), HandlerDef(this, "controllers.Application", "deleteComputador", Seq(classOf[Long]), "POST", """""", _prefix + """computadores/$id<[^/]+>/delete""")
)
                      

// @LINE:15
def computadores(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.computadores(), HandlerDef(this, "controllers.Application", "computadores", Seq(), "GET", """""", _prefix + """computadores""")
)
                      

// @LINE:10
def funcionario(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.funcionario(), HandlerDef(this, "controllers.Application", "funcionario", Seq(), "GET", """""", _prefix + """funcionario""")
)
                      
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      