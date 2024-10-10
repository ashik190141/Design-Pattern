public class fileadapter implements file{
    advanceFileSystem advanceFileSystem;
    @Override
    public void openPdf(String fileType, String fileName) {
        if(fileType.equalsIgnoreCase("doc")){
            advanceFileSystem=new docFile();
            advanceFileSystem.doc(fileName);
        }
        else if(fileType.equalsIgnoreCase("excel")){
            advanceFileSystem=new excelFile();
            advanceFileSystem.excel(fileName);
        }
        else{
            advanceFileSystem=new xmlFile();
            advanceFileSystem.xml(fileName);
        }
    }
    
}
