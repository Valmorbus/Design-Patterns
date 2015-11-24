package proxy.catalog;

import java.io.File;

public class Catalog implements CatalogInterface{
	private File[] folder;
	private File file;
	private File[] secondaryFolder;
	private File secondaryFile;
	
	public Catalog(String s){
		file = new File("c:/"+s);
		folder = file.listFiles(); 
		listFiles(s);
	}

	@Override
	public void listFiles(String s) {
		for(File str : folder){
			
			if(str.isDirectory()){
				System.out.println(str.getPath().substring(3)+ " is Directory");
				secondList(str);
			}
			else
				System.out.println(str.getPath().substring(3) + " is file");	
		}
			
	}
	private void secondList(File file){
		
		secondaryFile = file;
		secondaryFolder = secondaryFile.listFiles();
		for (File f : secondaryFolder){
			if (f.isDirectory()){
				System.out.println(f.getPath().substring(3)+" is directory");
				secondList(f);
			}		
			else
			System.out.println(f.getPath().substring(3) +" is File");
		}
		
	}

	@Override
	public void login() {
		
		
	}

}
