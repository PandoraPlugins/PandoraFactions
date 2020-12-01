package com.massivecraft.factions.cmd.roster;

import com.massivecraft.factions.FactionsPlugin;
import com.massivecraft.factions.cmd.CommandContext;
import com.massivecraft.factions.cmd.FCommand;
import com.massivecraft.factions.zcore.util.TL;
import org.bukkit.Bukkit;

import java.util.List;

public class CmdRosterView extends FCommand {
    private final Roster roster;

    @Override
    public void perform(CommandContext context) {
        Bukkit.getScheduler().runTaskAsynchronously(FactionsPlugin.getInstance(), () -> {
            List<RosterPlayer> playerList = roster.getRoster(context.faction.getId());
            // todo: reply with formatted message and maybe multiple pages?

        });
    }

    @Override
    public TL getUsageTranslation() {
        return TL.ROASTER_VIEW_DESCRIPTION;
        // did this
    }

    public CmdRosterView(Roster roster) {
        this.roster = roster;

    }
}
