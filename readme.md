# **5 Schaltjahrberechnung auf dem Mars**

Maximale Anzahl an Dateien: 1

Arbeitstyp: Einzelarbeit

================================

Regeln:
Schaltjahrberechnung auf dem Mars
Das tropische Mars-Jahr besteht aus 668,5907 marsianischen Sonnentagen.
Daher ist die Schaltjahrberechnung auf dem Mars wie folgt:
1. Die geraden Jahre bekommen einen Tag weggenommen, den Schalttag.
2. Bei den durch 10 teilbaren Jahren wird der Schalttag wieder zugefügt.
3. Die durch 100 teilbaren Jahre bekommen diesen Schalttag wieder weggenommen.
4. Schließlich wird bei den durch 1000 teilbaren Jahren der Schalttag wieder zugefügt.
=================================================

> **Aufbau:**
1. Deklarieren Sie für 10, 100, 1000 jeweils lokale, konstante Variablen
2. Lesen Sie die Jahreszahl ein
3. Überprüfen Sie, dass es sich bei einer eingegebenen Jahreszahl um ein Schaltjahr handelt
4. (falls 3. nicht zutrifft)
- Geben Sie das Ergebnis wie folgt aus:
  ▪ „Das Marsjahr <Jahreszahl> hat keinen Schalttag.“
  4.2 (falls 3. zutrifft)
- Geben Sie das Ergebnis wie folgt aus:
  ▪ „Das Marsjahr <Jahreszahl> hat einen Schalttag.“
  Hinweis: Wir betrachten nur Jahreszahlen zwischen 50000 (einschließlich) und 90000 (einschließlich).
  Ansonsten beenden Sie das Programm mit der Fehlermeldung „Keine korrekte Jahreszahl“.
