package TipeSpell;

import java.util.Scanner;

public class RecoverySpell extends Spell {
    private Integer recoveryLevel;

    public RecoverySpell(Integer magicEnergySpent, String name, Integer recoveryLevel, Integer recoveryLevel1) {
        super(magicEnergySpent, name, recoveryLevel);
        this.recoveryLevel = recoveryLevel1;
    }

    public RecoverySpell(Scanner keyboard) {
        super();
    }

    @Override
    public Integer getRecoveryLevel() {
        return recoveryLevel;
    }

    @Override
    public void setRecoveryLevel(Integer recoveryLevel) {
        this.recoveryLevel = recoveryLevel;
    }
}
