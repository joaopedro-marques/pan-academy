package com.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DesafioLeitura {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		Object obj = new JSONParser().parse(new FileReader("./src/main/java/teste2.json"));

		JSONObject jsonzinho = (JSONObject) obj;

		// iterando um objeto

		Iterator<String> itr1 = jsonzinho.keySet().iterator();
		while (itr1.hasNext()) {
			Object chave = itr1.next();
			Object valor = jsonzinho.get(chave);

			System.out.println(chave + ":" + valor);

		}
		
		//Iterando array de objetos
		Object obj2 = new JSONParser().parse(new FileReader("./src/main/java/teste4.json"));
		JSONArray arrayJson = (JSONArray) obj2;
		
		Iterator itr2 = arrayJson.iterator();
		
		while (itr2.hasNext())
		{
			itr1 = ((Map) itr2.next()).entrySet().iterator();
			while (itr1 .hasNext()) 
			{
				Object chave = itr1.next();

				System.out.println(chave);
			}
		}
		
		
	}
}