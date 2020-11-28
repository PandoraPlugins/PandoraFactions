package com.massivecraft.factions.cmd.roster;

import org.bukkit.OfflinePlayer;

import java.util.List;
import java.util.UUID;

/**
 * Handles all requests between database and plugin.
 */
public interface Roster {

    /**
     * Returns all players in a roster
     *
     * @param factionID the id of the faction
     * @return A possibly empty list of {@link RosterPlayer}.
     */
    List<RosterPlayer> getRoster(String factionID);

    /**
     * Saves a roster player
     *
     * @param player the player to save
     */
    void savePlayer(RosterPlayer player);

    /**
     * Removes a roster player
     *
     * @param player the player to remove
     */
    void removePlayer(RosterPlayer player);

    /**
     * Removes a roster player by uuid.
     *
     * @param uuid uuid of the player
     */
    void removePlayer(UUID uuid);

    /**
     * Removes a roster player.
     *
     * @param player the player
     */
    void removePlayer(OfflinePlayer player);

    /**
     * Removes a faction and it's players (as if deleted)
     *
     * @param factionID the faction id
     */
    void removeFaction(String factionID);

    /**
     * Updates the player in the roster with the new information.
     *
     * @param player the player to update
     */
    void updatePlayer(RosterPlayer player);

    /**
     * Updates a player without using {@link RosterPlayer}
     *
     *
     * @param player the player to update
     * @param factionsID the faction id
     * @param active whether user is on the active roster or not.
     */
    void updatePlayer(OfflinePlayer player, String factionsID, boolean active);


    /**
     * Sets whether a player is active or not and updates it.
     *
     * @param player the player to update
     * @param active whether active or not.
     */
    void setActive(RosterPlayer player, boolean active);

    /**
     * Sets whether a player is active or not and updates it.
     *
     * @param player the player to update UUID's.
     * @param active whether active or not.
     */
    void setActive(UUID player, boolean active);

    /**
     * Sets whether a player is active or not and updates it.
     *
     * @param player the player to update
     * @param active whether active or not.
     */
    void setActive(OfflinePlayer player, boolean active);
}



//    CREATE DATABASE IF NOT EXISTS dbname;
//
//    CREATE TABLE IF NOT EXISTS tablename
//        (
//                FID    VARCHAR(500) UNICODE KEY,
//    UID    VARCHAR(36) PRIMARY KEY,
//    ACTIVE BOOLEAN NOT NULL
//);
//
//        SELECT *
//        FROM tablename
//        WHERE FID = ?;
//
//        UPDATE tablename
//        SET FID=?,
//        ACTIVE=?
//        WHERE UID = ?;
//
//        UPDATE tablename
//        SET ACTIVE=?
//        WHERE UID = ?;
//
//        INSERT INTO tablename (FID, UID, ACTIVE)
//        VALUES (?, ?, ?);
//
//        DELETE
//        FROM tablename
//        WHERE UID = ?;
//
//        DELETE
//        FROM tablename
//        where FID = ?;
//
//        SELECT *
//        FROM tablename
//        WHERE FID = ? AND ACTIVE=TRUE;





