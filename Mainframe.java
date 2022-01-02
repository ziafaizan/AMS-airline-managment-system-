package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
    
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.jpg")));
	NewLabel.setBounds(-150, -150, 1920, 990); 
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("AIR INDIA WELCOMES YOU");
	AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
	AirlineManagementSystem.setBounds(700, 170, 1000, 55);
	NewLabel.add(AirlineManagementSystem);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("AIRLINE SYSTEM");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFO");
	AirlineSystem.add(FlightDetails);
		
	JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
	AirlineSystem.add(ReservationDetails);
		
	JMenuItem Journey_Details = new JMenuItem("JOURNEY_DETAILS");
	AirlineSystem.add(Journey_Details);
		
	JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
	AirlineSystem.add(SectorDetails_1);
		
	JMenuItem Passenger_details = new JMenuItem("Passenger_details");
	AirlineSystem.add(Passenger_details);
		
	
        
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        
	ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
            }
	});
		
        Journey_Details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        Passenger_details.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Passenger_details();
            }
	});
		
        setSize(1950,1090);
	setVisible(true);
    }
}
