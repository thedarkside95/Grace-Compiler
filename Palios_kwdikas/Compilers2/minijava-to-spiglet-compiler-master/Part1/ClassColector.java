import syntaxtree.*;
import visitor.GJNoArguDepthFirst;
import java.util.*;
import java.util.Vector;
import attribute.*;
import symboltable.*;


public class ClassColector extends  GJNoArguDepthFirst<classType> {
 
  	Vector<classType> classList;
    
    public ClassColector(Vector<classType> classList){
      this.classList = classList;
    }


    public static boolean contains(Vector<classType> classList, classType className){
      for(int i=0; i<classList.size(); i++){
        if(classList.get(i).name.equals(className.name))
          return true;
      }
      return false;
    }


   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "classType"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> "{"
    * f14 -> ( VarDeclaration() )*
    * f15 -> ( Statement() )*
    * f16 -> "}"
    * f17 -> "}"
    */
	public classType visit(MainClass n) throws Exception {
    	classType identifier = n.f1.accept(this);
		if(!contains(classList,identifier))		
	    	classList.add(identifier);
	    else{
	  		throw new Exception("Error: Double definition of class "+identifier.name);
	  	}
      	return null;
	}

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( VarDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */
	public classType visit(ClassDeclaration n) throws Exception {
		classType identifier = n.f1.accept(this);
		if(!contains(classList,identifier))	{
			classList.add(identifier);
		}
		else{
			throw new Exception("Error: Double definition of class "+identifier.name);
		}
		return null;
	}

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "extends"
    * f3 -> Identifier()
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( MethodDeclaration() )*
    * f7 -> "}"
    */
	public classType visit(ClassExtendsDeclaration n) throws Exception {
		classType identifier = n.f1.accept(this);
		classType extendedIdentifier = n.f3.accept(this);
		if(!contains(classList,identifier)){		
			if(!contains(classList,extendedIdentifier)){
				throw new Exception("Error: No definition found for class "+extendedIdentifier.name);
			}
			classList.add(identifier);
		}
		else{
			throw new Exception("Error: Double definition of class "+identifier.name);
		}
		return null;
	}

   /**
    * f0 -> <IDENTIFIER>
    */
	public classType visit(Identifier n) throws Exception {
		return new classType(n.f0.toString());
	}

}
