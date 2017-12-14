package syntaxHighlight;

public class SyntaxHighlight {
	
	Colors colors = new Colors();
	Cases cases = new Cases();
	FontType fontType = new FontType();	
	String input;
        
    public SyntaxHighlight(String in){
        input = in;
    }
    
    public void getOutput(){
    	
        input = input.replaceAll("as",colors.getBlue()+cases.getCapital("as")+colors.getBlue());
        input = input.replaceAll("(?i)if",colors.getRed()+fontType.getBold()+"if"+fontType.getBold()+colors.getRed()); //(?i) for case insensitive
        input = input.replaceAll("this",colors.getRed()+fontType.getBold()+"this"+fontType.getBold()+colors.getRed()); 
        input = input.replaceAll("\\band\\b",colors.getBlue()+cases.getCapital("and")+colors.getBlue()); //"\\b \\b" for replacing exact word
        input = input.replaceAll("then",colors.getOrange()+"then"+colors.getOrange());
        
        System.out.println("Output : "+input);
    }

    public static void main(String []args){
    	SyntaxHighlight hw = new SyntaxHighlight("If hope is that then will fill and terraces to make as stands a statement about the importance of this club");
        hw.getOutput();
     }
}

/*String[] keywords = {"as","if","this","and","then"};
String[] colour = {"[blue]","[red]","[red]","[blue]","[orange]"};
String[] cases = {"capital","lower","lower","capital","lower"};
String[] fontType = {"[normal]","[bold]","[bold]","[normal]","[normal]"};*/