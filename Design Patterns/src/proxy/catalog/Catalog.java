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
			System.out.println(str.getPath().substring(3));	
			if(str.isDirectory()){
				secondList(str);
			}
		}
			
	}
	private void secondList(File file){
		System.out.print( " is Directory");
		secondaryFile = file;
		secondaryFolder = secondaryFile.listFiles();
		for (File f : secondaryFolder)
			System.out.println(f.getPath().substring(3) +" is File");
	}

	@Override
	public void login() {
		
		
	}

}
