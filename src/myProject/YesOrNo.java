package myProject;

import javax.swing.JOptionPane;

public class YesOrNo
{

	public static void main(String[] args)
	{
		boolean fries;
		int  num;
		String howMuch;
		System.out.println("I fixed the problem");
		fries = (JOptionPane.showConfirmDialog
				(null, "Would you like fries?","Please choose",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);
		if(fries)
		{
			howMuch = JOptionPane.showInputDialog("How much fries would you like");
			num = (Integer.parseInt(howMuch)) * 2;
			JOptionPane.showMessageDialog(null, num, "The peice", JOptionPane.PLAIN_MESSAGE);
		}
	}

}
