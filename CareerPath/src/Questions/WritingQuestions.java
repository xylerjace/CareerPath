	package Questions;
	
	import javax.swing.*;
	import java.awt.*;
	
	public class WritingQuestions extends JPanel implements QuestionPanel{
		private int points = 0;
		Choices choice1;
		Choices choice2;
		Choices choice3;
		Choices choice4;
		Choices choice5;
		Choices choice6;
		Choices choice7;
		Choices choice8;
		Choices choice9;
		Choices choice10;
		
		
	    public WritingQuestions() {
	    	setLayout(null);
	    	setBackground(new Color(0x0B132B));
	    	
	    	  JTextArea textArea = new JTextArea("Question: How proficient do you consider yourself in expressing ideas and concepts through written communication?");
	    	  textArea.setForeground(Color.WHITE);
	    	  textArea.setFont(new Font("Monospaced", Font.PLAIN, 17));
	          textArea.setBounds(0, 0, 1200, 70);
	          textArea.setEditable(false);
	          textArea.setBackground(getBackground());
	          textArea.setLineWrap(true);
	          textArea.setWrapStyleWord(true);
	          add(textArea);
	          
	        choice1 = new Choices();
	    	choice1.setBounds(00,50,1200, 117);
	    	choice1.setBackground(getBackground()); 
	    	add(choice1);
	    	add(textArea);
	    	
	    	JTextArea textArea1 = new JTextArea("Question: Can you discuss a writing project where your skills effectively conveyed information and engaged the audience/readers?");
	  	  	textArea1.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea1.setBounds(0,165, 1200, 70);
	        textArea1.setForeground(Color.WHITE);
	        textArea1.setEditable(false);
	        textArea1.setLineWrap(true);
	        textArea1.setWrapStyleWord(true);
	        textArea1.setBackground(getBackground());
	        add(textArea1);
	        choice2 = new Choices();
		  	choice2.setBounds(0,210,1200, 120);
		  	choice2.setBackground(getBackground()); 
		  	add(choice2);
		  	add(textArea1);
		  	
		  	JTextArea textArea2 = new JTextArea("Question: How skilled are you in adapting your writing style to different audiences?");
	  	  	textArea2.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea2.setBounds(0,330, 1200, 70);
	        textArea2.setEditable(false);
	        textArea2.setLineWrap(true);
	        textArea2.setForeground(Color.WHITE);
	        textArea2.setWrapStyleWord(true);
	        textArea2.setBackground(getBackground());
	        add(textArea2);
	        choice3 = new Choices();
	        choice3.setBackground(getBackground()); 
		  	choice3.setBounds(0,375,1200, 120);
		  	add(choice3);
		  	add(textArea2);
		  	
		  	JTextArea textArea3 = new JTextArea("Question: How often do you incorporate creativity and innovation in your writing projects?");
	  	  	textArea3.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea3.setBounds(0,495, 1200, 52);//+165
	        textArea3.setEditable(false);
	        textArea3.setLineWrap(true);
	        textArea3.setForeground(Color.WHITE);
	        textArea3.setBackground(getBackground());
	        textArea3.setWrapStyleWord(true);
	        add(textArea3);
	        choice4 = new Choices();
		  	choice4.setBounds(0,540,1200, 120);//+45
		  	choice4.setBackground(getBackground()); 
		  	add(choice4);
		  	add(textArea3);
		  	
		  	JTextArea textArea4 = new JTextArea("Question: How proficient are you in technical writing, especially in translating complex technical concepts into easily understandable content?");
	  	  	textArea4.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea4.setBounds(0,660, 1200, 52);//+165
	        textArea4.setEditable(false);
	        textArea4.setLineWrap(true);
	        textArea4.setForeground(Color.WHITE);
	        textArea4.setBackground(getBackground());
	        textArea4.setWrapStyleWord(true);
	        add(textArea4);
	        choice5 = new Choices();
		  	choice5.setBounds(0,705,1200, 120);//+45
		  	choice5.setBackground(getBackground()); 
		  	add(choice5);
		  	add(textArea4);
		  	
		  	JTextArea textArea5 = new JTextArea("Question: How meticulous are you in editing and proofreading your written work?");
	  	  	textArea5.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea5.setBounds(0,825, 1200, 52);//+165
	        textArea5.setEditable(false);
	        textArea5.setLineWrap(true);
	        textArea5.setForeground(Color.WHITE);
	        textArea5.setBackground(getBackground());
	        textArea5.setWrapStyleWord(true);
	        add(textArea5);
	        choice6 = new Choices();
		  	choice6.setBounds(0,875,1200, 120);//+45
		  	choice6.setBackground(getBackground()); 
		  	add(choice6);
		  	add(textArea5);
		  	
		  	JTextArea textArea6 = new JTextArea("Question: How strategic are you in developing content strategies for various writing projects?");
	  	  	textArea6.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea6.setBounds(0,990, 1200, 52);//+165
	        textArea6.setEditable(false);
	        textArea6.setLineWrap(true);
	        textArea6.setForeground(Color.WHITE);
	        textArea6.setBackground(getBackground());
	        textArea6.setWrapStyleWord(true);
	        add(textArea6);
	        choice7 = new Choices();
		  	choice7.setBounds(0,1040,1200, 120);//+45
		  	choice7.setBackground(getBackground()); 
		  	add(choice7);
		  	add(textArea6);
		  	
		  	JTextArea textArea7 = new JTextArea("Question: How well do you approach writing for social media platforms, considering character limits and the need for concise, engaging content?");
	  	  	textArea7.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea7.setBounds(0,1155, 1200, 52);//+165
	        textArea7.setEditable(false);
	        textArea7.setLineWrap(true);
	        textArea7.setForeground(Color.WHITE);
	        textArea7.setBackground(getBackground());
	        textArea7.setWrapStyleWord(true);
	        add(textArea7);
	        choice8 = new Choices();
		  	choice8.setBounds(0,1205,1200, 120);//+45
		  	choice8.setBackground(getBackground()); 
		  	add(choice8);
		  	add(textArea7);
		  	
		  	JTextArea textArea8 = new JTextArea("Question: How proficient are you in business and professional writing, including emails, reports, and proposals?");
	  	  	textArea8.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea8.setBounds(0,1320, 1200, 52);//+165
	        textArea8.setEditable(false);
	        textArea8.setLineWrap(true);
	        textArea8.setForeground(Color.WHITE);
	        textArea8.setBackground(getBackground());
	        textArea8.setWrapStyleWord(true);
	        add(textArea8);
	        choice9 = new Choices();
		  	choice9.setBounds(0,1370,1200, 120);//+45
		  	choice9.setBackground(getBackground()); 
		  	add(choice9);
		  	add(textArea8);
		  	
		  	JTextArea textArea9 = new JTextArea("Question:  How consistently do you adhere to style guides and writing standards in your projects?");
	  	  	textArea9.setFont(new Font("Monospaced", Font.PLAIN, 17));
	        textArea9.setBounds(0,1485, 1200, 52);//+165
	        textArea9.setEditable(false);
	        textArea9.setLineWrap(true);
	        textArea9.setForeground(Color.WHITE);
	        textArea9.setBackground(getBackground());
	        textArea9.setWrapStyleWord(true);
	        add(textArea9);
	        choice10 = new Choices();
		  	choice10.setBounds(0,1535,1200, 120);//+45
		  	choice10.setBackground(getBackground()); 
		  	add(choice10);
		  	add(textArea9);
		       
	    }
	    
	    public void updatePoints() {
	        points = choice1.getPoints() + choice2.getPoints() + choice3.getPoints()
	                + choice4.getPoints() + choice5.getPoints() + choice6.getPoints()
	                + choice7.getPoints() + choice8.getPoints() + choice9.getPoints()
	                + choice10.getPoints();
	    }
	
	    public int getPoints() {
	        return points;
	    }
	}