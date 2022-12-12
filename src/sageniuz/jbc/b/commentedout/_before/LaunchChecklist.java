package sageniuz.jbc.b.commentedout._before;

import sageniuz.jbc.b.commentedout.Commander;
import sageniuz.jbc.b.commentedout.Status;

import java.util.Arrays;
import java.util.List;

public class LaunchChecklist {
    List<String> checks = Arrays.asList(
        "Cabin Leak",
        // "Communication", // Do we actually want to talk to Houston?
        "Engine",
        "Hull",
        // "Rover", // We don't need it, I think...
        "OxygenTank"
        // "Supplies"
    );

    Status prepareLaunch(Commander commander) {
        for (String check : checks) {
            var shouldAbortTakeOff = commander.isFailling(check);
            if (shouldAbortTakeOff) {
                // System.out.println("REASON FOR ABORT: " + item);
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }

}
