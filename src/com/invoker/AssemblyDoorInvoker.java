package com.invoker;

import com.command.Command;

public class AssemblyDoorInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
