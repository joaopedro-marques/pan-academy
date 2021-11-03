package com.json.leitura;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 

public class EscrevendoArray {	
	
	
	    @SuppressWarnings("unchecked")
	    public static void main( String[] args )
	    {
	        //First Employee
	        JSONObject employeeDetails = new JSONObject(); //insatnciando um JSONobject
	        employeeDetails.put("firstName", "Lokesh");//acrescentado com um put nem key primeiro nome 
	        employeeDetails.put("lastName", "Gupta"); //acrescentado com um put nem key sobrenome 
	        employeeDetails.put("website", "howtodoinjava.com"); //acrescentado com um put nem key website nome 
	         
	        JSONObject employeeObject = new JSONObject(); //Instanciando um novo objeto
	        employeeObject.put("employee", employeeDetails); //adicionando o primeiro objeto em um array de objetos
	         
	        //Second Employee
	        JSONObject employeeDetails2 = new JSONObject(); //insatnciando um JSONobject segundo empregado
	        employeeDetails2.put("firstName", "Brian"); //acrescentando primeiro nome Brian com o detalhe.
	        employeeDetails2.put("lastName", "Schultz"); //acrescetando segundo nome com o detalhe.
	        employeeDetails2.put("website", "example.com"); //acrescentadno o website com o nome.
	         
	        JSONObject employeeObject2 = new JSONObject();  //insatnciando um JSONobjectempregado 2
	        employeeObject2.put("employee", employeeDetails2); //acrrescentando o objeto empregado 2 no objeto
	         
	        //Add employees to list
	        JSONArray employeeList = new JSONArray(); //criando o json array
	        employeeList.add(employeeObject); //adicionando o primeiro objeto
	        employeeList.add(employeeObject2); //adicionando o segundo objeto
	         
	        //Write JSON file
	        try (FileWriter file = new FileWriter("employees.json")) {
	            //We can write any JSONArray or JSONObject instance to the file
	            file.write(employeeList.toJSONString());  //escrevendo em arquivo jjson
	            file.flush(); //interrompendo e fechando o arquivo
	 
	        } catch (IOException e) {
	            e.printStackTrace(); //tentando o erro
	        }
	    }
	
}
