package com.javram.makereport;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Report {
	private String nameFile;
	private String title;
	private String content;
	private String extension;
		
	public String getNameFile() {
		return nameFile;
	}
	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	//metodo
	public void makeReport()
	{
		if((getNameFile() != null) && (getTitle() != null) && (getContent() != null))
		{
			//Crear el archivo, file es una clase que viene del paquete IO
			//File crea virtualmente un archivo, lo podemos manipular
			try {//esto se llama Exception y va a ayudar en caso de que ocurra un error
				File file = new File(getNameFile() + "." + getExtension());
				FileOutputStream fos = new FileOutputStream(file);;//esto de try lo tiene que tener siempre el FileOutputStream
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				bw.write(getContent());
				bw.close();//siempre cerrar el buffer
			} catch (IOException e) {
				e.printStackTrace();
			}//FileOutputStream es para escribir bytes en un archivo
			//FileWriter escribe caracteres en un archivo.
			//El primero lo usas para crear archivos tipo imágenes, también puedes usarlo para crear archivos de texto, en ese caso deberás utilizar como auxiliar FileWriter pues está última es solo para escribir caracteres
		}
		else
		{
			System.out.println("Ingresa los datos del archivo");
		}
	}
	
}
