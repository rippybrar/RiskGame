       package com.risk.model;
import java.io.IOException;

/**this an interface that all concrete strategies should implement it.
 * @author Nayan
 * @version 1.0.0.0
 */

public interface StrategyPlayer {
	String ReinforcementPhase(Player param_currentPlayer) throws IOException, Exception;
	String AttackPhase(Player param_currentPlayer) throws IOException, Exception;
	String FortificationPhase(Player param_currentPlayer) throws IOException, Exception;

}
