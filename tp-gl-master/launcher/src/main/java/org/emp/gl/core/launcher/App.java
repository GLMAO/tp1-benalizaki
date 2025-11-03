package org.emp.gl.core.launcher;

import java.util.Random;

import javax.swing.SwingUtilities;

import org.emp.gl.clients.CompteARebours;
import org.emp.gl.clients.HorlogeGUI;
import org.emp.gl.timer.service.TimerService;
import org.emp.gl.time.service.impl.DummyTimeServiceImpl;

public class App {

    public static void main(String[] args) {
        testDuTimeService();
    }
    private static void testDuTimeService() {
    TimerService timerService = new DummyTimeServiceImpl();
    
    // Créer 10 comptes à rebours avec valeurs aléatoires entre 10 et 20
    java.util.Random random = new java.util.Random();
    for (int i = 1; i <= 10; i++) {
        int valeurAleatoire = 10 + random.nextInt(11); // 10..20
        new CompteARebours("Compte-" + i, valeurAleatoire, timerService);
    }

    // Lancer l'interface graphique
    SwingUtilities.invokeLater(() -> {
        HorlogeGUI gui = new HorlogeGUI(timerService);
        gui.setVisible(true);
    });
}

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}