import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

/**
 * Created by lyt on 17-3-14.
 */
public class Main {
    public static void main(String []args){
        new ticket();

        //JFrame frame = new login();
    }
}

class login extends JFrame {
    private JPanel panel = new JPanel();


    public login() {
        log();
    }
    void log()
    {
        setTitle("请登录");
        setSize(270,180);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-135,screenSize.height/2-90);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        //设置可见
        panel.setSize(getSize());
        this.add(panel);
        //设置布局
        panel.setLayout(null);

        /*
        定义组件位置。
        setBounds(x,y,width,heigh)
        x,y位置，width,heigh大小
         */

        final JLabel label = new JLabel("用户名：");
        final JTextField userText = new JTextField(20);
        JLabel passwdLabel = new JLabel("密   码：");
        JPasswordField passwd = new JPasswordField(20);
        final JComboBox check_number = new JComboBox(new String[]{"售票员", "经理", "管理员"});
        final JButton loginButton = new JButton("登录");
        JButton forget_pass = new JButton("改密");

        userText.setBounds(75, 20, 165, 25);
        passwdLabel.setBounds(10, 50, 60, 25);
        passwd.setBounds(75, 50, 165, 25);
        check_number.setBounds(10, 90, 60, 25);
        loginButton.setBounds(80, 90, 60, 25);
        forget_pass.setBounds(170,90,60,25);
        label.setBounds(10, 20, 60, 25);

        panel.add(label);
        panel.add(passwdLabel);
        panel.add(check_number);
        panel.add(userText);
        panel.add(passwd);
        panel.add(loginButton);
        panel.add(forget_pass);

        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //System.exit(1);
                if (true) {
                    JLabel wel = new JLabel("欢迎，" + check_number.getSelectedItem() + " " + userText.getText());
                    panel.removeAll();
                    panel.repaint();
                    System.out.println(login.super.getHeight() + " " + login.super.getWidth());
                    wel.setBounds((login.super.getWidth() - 160) / 2, login.super.getHeight() / 2 - 30, 160, 30);
                    panel.add(wel);
                    panel.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                            super.mouseClicked(e);
                            login.super.setVisible(false);
                            new ticket();

                        }
                    });
                }
            }
        });
        forget_pass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(true){
                    login.super.setTitle("修改密码");
                    panel.removeAll();
                    panel.repaint();
                    JButton ret = new JButton("返回");
                    JLabel label1 = new JLabel("用户名:");
                    JLabel label2 = new JLabel("原密码:");
                    JLabel label3 = new JLabel("新密码:");
                    JButton ent = new JButton("确认");
                    JTextField textField = new JTextField(userText.getText(),20);
                    JPasswordField passwordField1 = new JPasswordField(20);
                    JPasswordField passwordField2 = new JPasswordField(20);


                    ret.setBounds(10,5,60,15);
                    label1.setBounds(10, 20, 60, 25);
                    textField.setBounds(75, 20, 165, 25);
                    label2.setBounds(10, 50, 60, 25);
                    passwordField1.setBounds(75, 50, 165, 25);
                    label3.setBounds(10,80,60,25);
                    passwordField2.setBounds(75,80,165,25);
                    ent.setBounds(105,110,60,25);

                    panel.add(ret);
                    panel.add(label1);
                    panel.add(label2);
                    panel.add(label3);
                    panel.add(textField);
                    panel.add(passwordField1);
                    panel.add(passwordField2);
                    panel.add(ent);

                    ret.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            panel.removeAll();
                            panel.repaint();
                            log();
                        }
                    });

                    ent.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            panel.removeAll();
                            panel.repaint();
                            if(true){
                                login.super.setTitle("成功");
                                JLabel label1 = new JLabel("密码修改成功！");
                                JButton ret = new JButton("返回");

                                label1.setBounds(90,35,100,35);
                                ret.setBounds(100,90,60,25);

                                panel.add(label1);
                                panel.add(ret);

                                ret.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        panel.removeAll();
                                        panel.repaint();
                                        log();
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
    }

}


class ticket extends JFrame{
    private JPanel panel1 = new JPanel(); //显示电影
    private JPanel panel2 = new JPanel(); //售退票
    private JPanel panel1_1 = new JPanel(); //选择日期
    private JPanel panel1_2 = new JPanel(); //提示
    private JComboBox year = new JComboBox();
    private JComboBox month = new JComboBox();
    private JComboBox day = new JComboBox();

    private JButton to_left = new JButton(new ImageIcon("arrow_left.png"));
    private JButton to_right = new JButton();

    private JLabel label0 = new JLabel("选择日期");
    private JButton exit = new JButton("退出登录");

    public ticket(){
        setResizable(false);
        setTitle("选择要操作的电影");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-480,screenSize.height/2-360);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.setLayout(null);
        panel1_1.setLayout(null);
        panel1_2.setLayout(null);
        panel2.setLayout(null);

        //Icon ico1 = new ImageIcon("a.png");
        //to_left.setIcon(new ImageIcon("arrow_left.png"));

        setSize(960,720);
        panel1_1.setSize(280,240);
        panel1.setSize(680,240);
        panel1_2.setSize(960,240);
        panel1_1.setBackground(Color.white);
        panel1.setBackground(Color.gray);
        panel1_2.setBackground(Color.yellow);


        panel2.setSize(960,480);
        panel2.setBackground(Color.pink);

        add(panel1_1);
        add(panel1);
        add(panel1_2);
        add(panel2);

        exit.setBounds(850,20,80,25);
        label0.setBounds(30,20,60,25);
        to_left.setBounds(300,80,32,32);

        panel1_2.add(exit);
        panel1_1.add(label0);
        panel1.add(to_left);

        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new login();
                setVisible(false);
            }
        });

        setVisible(true);
    }
}
