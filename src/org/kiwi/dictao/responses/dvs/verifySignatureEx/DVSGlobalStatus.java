package org.kiwi.dictao.responses.dvs.verifySignatureEx;

import org.kiwi.dictao.responses.ListeReponses;
import org.kiwi.dictao.responses.Reponse;
import org.kiwi.dictao.responses.Reponse.TypeReponse;

public class DVSGlobalStatus extends ListeReponses<Integer> {

    public DVSGlobalStatus(Integer leCode) {super(leCode);}

    @Override
    protected void computeListe(Integer leCode) {
        if ((leCode & 8191) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
        leCode >>= 13;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Mise à jour des CRLs impossible"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Mise à jour des CRLs forcée avant exécution ou mise à jour non demandée"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Au moins une signature est invalide"));
        } else {
            maListeDeReponses.add(new Reponse(TypeReponse.SUCCES, "Toutes les signatures sont valides (tous les contrôles effectués ont retournés le résultats attendu)"));
        }
        leCode >>= 1;

        if ((leCode & 1) != 0) {
            maListeDeReponses.add(new Reponse(TypeReponse.ERREUR, "Erreur normalement non attribué"));
        }
    }
}
