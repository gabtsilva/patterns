package domain;

import main.MainMachine;

public class MachineACafe {
	public enum State{
		IDLE {
			@Override
			public void selectionnerBoisson(MachineACafe machine, ToucheBoisson toucheBoisson) {
				machine.afficherPasAssez(toucheBoisson);
			}

			@Override
			public void rendreMonnaie(MachineACafe machine) {
				machine.setState(State.IDLE);
			}
		}, COLLECTE {
			@Override
			public void selectionnerBoisson(MachineACafe machine, ToucheBoisson toucheBoisson) {
				if (toucheBoisson.getPrix() > machine.montantEnCours) {
					machine.boisson = toucheBoisson;
					machine.afficherPasAssez(machine.boisson);
					machine.boisson = toucheBoisson;
					machine.setState(State.PAS_ASSEZ);
					return;
				}
				machine.montantEnCours -= toucheBoisson.getPrix();
				machine.afficherBoisson(toucheBoisson);
				machine.afficherMontant();
				if (machine.montantEnCours == 0)
					machine.setState(State.IDLE);
				else
					machine.setState(State.COLLECTE);
			}
		},
		PAS_ASSEZ {
			@Override
			public void entrerMonnaie(MachineACafe machine, Piece piece) {
				machine.montantEnCours += piece.getValeur();
				machine.afficherMontant();
				if (machine.boisson.getPrix() > machine.montantEnCours) {
					machine.afficherPasAssez(machine.boisson);
				} else {
					machine.montantEnCours -= machine.boisson.getPrix();
					machine.afficherBoisson(machine.boisson);
					machine.boisson = null;
					machine.afficherMontant();
					if (machine.montantEnCours == 0)
						machine.setState(State.IDLE);
					else
						machine.setState(State.COLLECTE);
				}
			}

			@Override
			public void selectionnerBoisson(MachineACafe machine, ToucheBoisson toucheBoisson) {
				throw new IllegalStateException();
			}

		};

		public void entrerMonnaie(MachineACafe machine, Piece piece){
			machine.montantEnCours += piece.getValeur();
			machine.afficherMontant();
			machine.setState(State.COLLECTE);
		};
		public abstract void selectionnerBoisson(MachineACafe machine, ToucheBoisson toucheBoisson);
		public void rendreMonnaie(MachineACafe machine){
			machine.afficherRetour();
			machine.montantEnCours = 0;
			machine.boisson = null;
			machine.setState(State.IDLE);
		};

	}
	
	private int montantEnCours = 0;
	private State etatCourant = State.IDLE;
	private ToucheBoisson boisson = null;

	public void setState(State state) {
		this.etatCourant = state;
	}
	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
	}

	public void entrerMonnaie(Piece piece) {
		this.etatCourant.entrerMonnaie(this, piece);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		this.etatCourant.selectionnerBoisson(this, toucheBoisson);
	}
	
	public void rendreMonnaie() {
		this.etatCourant.rendreMonnaie(this);
	}
}
