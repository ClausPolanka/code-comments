package sageniuz.jbc.b.commentedout.after;

import sageniuz.jbc.b.commentedout.Commander;
import sageniuz.jbc.b.commentedout.Status;

import java.util.Arrays;
import java.util.List;

public class LaunchChecklist {
    List<String> checks = Arrays.asList(
        "Cabin Leak",
        "Engine",
        "Hull",
        "OxygenTank"
    );

    Status prepareLaunch(Commander commander) {
        for (String check : checks) {
            var shouldAbortTakeOff = commander.isFailling(check);
            if (shouldAbortTakeOff) {
                return Status.ABORT_TAKE_OFF;
            }
        }
        return Status.READY_FOR_TAKE_OFF;
    }

}
