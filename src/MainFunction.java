import com.command.Command;
import com.command.LazerCommand;
import com.command.RoboticArmCommand;
import com.invoker.AssemblyDoorInvoker;

public class MainFunction {
	public static void main(String[] args) {

		AssemblyDoorInvoker receiver = new AssemblyDoorInvoker();

        // Create the concrete commands and associate them with the receiver
        Command lazerCommand = new LazerCommand();
        Command commandB = new RoboticArmCommand();

        // Create the invoker and set a command
        AssemblyDoorInvoker invoker = new AssemblyDoorInvoker();
        invoker.setCommand(lazerCommand);

        // Execute the command
        invoker.executeCommand();  // Output: Performing Operation A

        // Change the command and execute again
        invoker.setCommand(commandB);
        invoker.executeCommand();  // 
		
	}
}
