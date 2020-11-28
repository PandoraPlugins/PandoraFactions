package com.massivecraft.factions.cmd.roster;

import com.massivecraft.factions.FactionsPlugin;
import com.massivecraft.factions.cmd.CommandContext;
import com.massivecraft.factions.cmd.CommandRequirements;
import com.massivecraft.factions.cmd.FCommand;
import com.massivecraft.factions.struct.Permission;
import com.massivecraft.factions.zcore.util.TL;
import org.bukkit.Bukkit;


/**
 * todo remove this later
 * <p>
 * Active and inactive players list
 * <p>
 * Leaders only for changing rosters.
 * <p>
 * Leader and co for switching active/inactive rosters.
 * <p>
 * Everyone view rosters.
 */

public class CmdRoster extends FCommand {
    private Roster roster = null;
    private final CmdRosterView view;
    public CmdRoster() {
        super();
        // MySQL DB
        // todo: init roster here

        this.aliases.add("roster");
        this.requirements = new CommandRequirements.Builder(Permission.ROSTER)
                .playerOnly()
                .memberOnly()
                .build();
        view = new CmdRosterView(roster);
        // todo: add help long
        this.addSubCommand(view);


        roster = null;
    }

    @Override
    public void perform(CommandContext context) {
        context.commandChain.add(this);
        FactionsPlugin.getInstance().cmdAutoHelp.execute(context);

    }

    @Override
    public TL getUsageTranslation() {
        return TL.ROSTER_COMMAND_DESCRIPTION;
    }
}
