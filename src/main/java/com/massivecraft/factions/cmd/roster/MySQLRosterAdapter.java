package com.massivecraft.factions.cmd.roster;

import org.bukkit.OfflinePlayer;

import java.util.List;
import java.util.UUID;


// todo: add in constructor and other stuff. Maybe hikari???, have to check if factions has it's own hikari already.
public class MySQLRosterAdapter implements Roster {
    /**
     * Returns all players in a roster
     *
     * @param factionID the id of the faction
     * @return A possibly empty list of {@link RosterPlayer}.
     */
    @Override
    public List<RosterPlayer> getRoster(String factionID) {
        return null;
    }

    /**
     * Saves a roster player
     *
     * @param player the player to save
     */
    @Override
    public void savePlayer(RosterPlayer player) {

    }

    /**
     * Removes a roster player
     *
     * @param player the player to remove
     */
    @Override
    public void removePlayer(RosterPlayer player) {

    }

    /**
     * Removes a roster player by uuid.
     *
     * @param uuid uuid of the player
     */
    @Override
    public void removePlayer(UUID uuid) {

    }

    /**
     * Removes a roster player.
     *
     * @param player the player
     */
    @Override
    public void removePlayer(OfflinePlayer player) {

    }

    /**
     * Removes a faction and it's players (as if deleted)
     *
     * @param factionID the faction id
     */
    @Override
    public void removeFaction(String factionID) {

    }

    /**
     * Updates the player in the roster with the new information.
     *
     * @param player the player to update
     */
    @Override
    public void updatePlayer(RosterPlayer player) {

    }

    /**
     * Updates a player without using {@link RosterPlayer}
     *
     * @param player     the player to update
     * @param factionsID the faction id
     * @param active     whether user is on the active roster or not.
     */
    @Override
    public void updatePlayer(OfflinePlayer player, String factionsID, boolean active) {

    }

    /**
     * Sets whether a player is active or not and updates it.
     *
     * @param player the player to update
     * @param active whether active or not.
     */
    @Override
    public void setActive(RosterPlayer player, boolean active) {

    }

    /**
     * Sets whether a player is active or not and updates it.
     *
     * @param player the player to update UUID's.
     * @param active whether active or not.
     */
    @Override
    public void setActive(UUID player, boolean active) {

    }

    /**
     * Sets whether a player is active or not and updates it.
     *
     * @param player the player to update
     * @param active whether active or not.
     */
    @Override
    public void setActive(OfflinePlayer player, boolean active) {

    }
}
