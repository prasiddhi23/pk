import java.awt.*;
import java.awt.event.*;
   
       public class RegisterFrom extend frame{

RegisterFrom(){
setTitle("login from");
setSize(400,400);
setLayout(new Flowlayout());
  

    Labe L1=new lable("Username");
    TextField t1 = new Textfield(20);
    Label l2 = new lable("Password");
    TextField t2 = new Textfield(20);
    Button b1 =new Button("login");
    Button b2 = new Button("cancel");


add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);

setVisible(true);

b1.addActionListener(new ActionListener()){
public void actionPerformed(ActionEvent e){
string data ="admin";
if (t1.getText()=="admin"&& t1.getText()=="admin");
 
if username.equal(validUsername)){
   system.out.println("login successful!");
}else{
system.out.println("invalid username!");
}
}
});
}




