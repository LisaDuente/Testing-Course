import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrontEnd extends JFrame {
    BackEnd  BackEnd;
    JPanel panel1;
    JPanel panelStart;
    JPanel GameOverPanel;
    JButton throwDice, startBackEndButton, restartButton;
    JTextField showDice;
    JTextField player1Name;
    JTextField player2Name;
    JTextField player1Score;
    JTextField player2Score;
    JTextField enterN1;
    JTextField enterN2, winner;
    ArrayList<JTextField> textFieldList;
    Boolean turn;

    public FrontEnd() {
        this.turn = false;
        this.BackEnd = new BackEnd();
        this.setSize(800, 200);
        this.setResizable(false);

        this.setTitle("BackEndOne");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.textFieldList = new ArrayList<JTextField>();
        makeItems();
        makePanel1();
        makePanelStart();
        makePanelGameOver();
        this.add(this.panelStart);
        this.setVisible(true);


    }

    //BackEndScreen
    public void makePanel1() {
        this.panel1 = new JPanel(new GridLayout(2, 2));

        this.panel1.add(this.player1Name);
        this.panel1.add(this.throwDice);
        this.panel1.add(this.player2Name);

        this.panel1.add(this.player1Score);
        this.panel1.add(this.showDice);
        this.panel1.add(this.player2Score);
    }

    //SplashScreen
    public void makePanelStart() {
        this.panelStart = new JPanel(new GridLayout(2, 2));
        this.panelStart.add(this.enterN1);
        this.panelStart.add(this.enterN2);
        this.panelStart.add(this.startBackEndButton);

    }

    //GameOverScreen
    public void makePanelGameOver() {
        this.GameOverPanel = new JPanel();
        this.GameOverPanel.add(winner);
        this.GameOverPanel.add(restartButton);


    }

    public void makeItems() {


        //PanelStart
        this.enterN1 = new JTextField("Player1");
        this.enterN2 = new JTextField("Player2");

        this.textFieldList.add(enterN1);
        this.textFieldList.add(enterN2);
        this.startBackEndButton = new JButton("Start Game");

        StartBackEnd startBackEnd = new StartBackEnd();
        startBackEndButton.addActionListener(startBackEnd);
        //Panel1
        this.throwDice = new JButton("Throw Dice!");
        ThrowDice throwDice = new ThrowDice();
        this.throwDice.addActionListener(throwDice);
        this.throwDice.setBackground(Color.red);

        this.showDice = new JTextField("DiceArea");
        this.textFieldList.add(showDice);
        showDice.setEditable(false);
        this.player1Name = new JTextField("");
        this.player2Name = new JTextField("");
        this.textFieldList.add(player1Name);
        this.textFieldList.add(player2Name);

        this.player1Name.setEditable(false);
        this.player2Name.setEditable(false);
        this.player1Score = new JTextField(BackEnd.player1Score());


        this.player2Score = new JTextField(BackEnd.player2Score());
        this.textFieldList.add(player1Score);
        this.textFieldList.add(player2Score);

        this.player1Score.setEditable(false);
        this.player2Score.setEditable(false);
        this.player1Score.setBackground(Color.red);
        this.player2Score.setBackground(Color.green);
        //GameOver
        this.winner = new JTextField();
        this.textFieldList.add(winner);
        this.restartButton = new JButton("Back");
        Back back = new Back();
        this.restartButton.addActionListener(back);
        setFieldFont();

    }

    public void setFieldFont() {
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        for (JTextField tf : this.textFieldList) {
            tf.setFont(font1);
        }


    }

    public void BackEndStart() {
        this.BackEnd.randomStarter();
        this.throwDice.setText("Press here: " + BackEnd.currentPlayerName());
        this.player1Name.setText(BackEnd.getPlayer1());
        this.player2Name.setText(BackEnd.getPlayer2());
        player1Score.setText(BackEnd.player1Score());
        player2Score.setText(BackEnd.player2Score());
        this.remove(panelStart);

        this.setButton();
        this.add(panel1);
        this.repaint();
        this.setVisible(true);

    }

    public void showDice() {
        this.showDice.setText("Dice shows: " + BackEnd.getDice());

    }

    public void updateScore() {

        this.player1Score.setText(BackEnd.player1Score());
        player2Score.setText(BackEnd.player2Score());

        this.setVisible(true);

        setButton();
        this.throwDice.setText("Press Here:" + BackEnd.currentPlayerName());
        if (BackEnd.gameOver()) {
            activateGameOver();
        }


    }

    public void activateGameOver() {
        this.winner.setText(BackEnd.getWinner());
        this.remove(panel1);
        this.add(GameOverPanel);
        this.repaint();
        this.setVisible(true);

    }

    private void setButton() {
        if (BackEnd.getCurrentPlayer() == 1) {
            this.throwDice.setBackground(Color.red);
        } else {
            this.throwDice.setBackground(Color.green);
        }
    }

    private void restart() {
        this.remove(GameOverPanel);
        this.add(panelStart);
        this.repaint();
        this.setVisible(true);

    }


    //Listeners
    private class StartBackEnd implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String n1 = enterN1.getText();
            String n2 = enterN2.getText();
            if (n1.length() > 10) {
                n1 = n1.substring(0, 10);
            }
            if (n2.length() > 10) {
                n2 = n2.substring(0, 10);
            }
            if (n1.length() == 0 || n1 == null || n2.length() == 0 || n2 == null) {
                JOptionPane.showMessageDialog(null, "Enter Name for both players, please");
                return;

            }
            BackEnd.startGame(n1, n2);

            player1Score.setText(BackEnd.player1Score());
            player2Score.setText(BackEnd.player2Score());

            BackEndStart();

        }
    }

    private class ThrowDice implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            BackEnd.throwDice();
            showDice();
            BackEnd.askToKeep();
            updateScore();

        }
    }

    private class Back implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            restart();
        }
    }

}