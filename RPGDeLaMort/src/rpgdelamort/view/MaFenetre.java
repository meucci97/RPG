package rpgdelamort.view;

import javax.swing.JFrame;


public class MaFenetre extends JFrame {
    
    public MaFenetre(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(860,540);
        this.setTitle("RPG DE LA MORT");
        this.setResizable(false);
        //Menu menu=new Menu(this);
        Menu vu = new Menu(this);
        //this.add(vu);
        vu.setVisible(true);
    }
}
