CREATE TABLE PlayerStats (
   Player VARCHAR(255),
   Number INT,
   FTA INT,
   FTM INT,
   FT_Percentage FLOAT,
   ThreePointAttempts INT,
   ThreePointMade INT,
   ThreePoint_Percentage FLOAT
);

INSERT INTO PlayerStats (Player, Number, FTA, FTM, FT_Percentage, ThreePointAttempts, ThreePointMade, ThreePoint_Percentage) VALUES
   ('Emma Altmire', 0, 380, 321, 0.84, 174, 85, 0.489),
   ('Mikayla Anderson', 12, 380, 304, 0.80, 183, 77, 0.421),
   ('Jayda Cartagena', 4, 300, 236, 0.79, 165, 68, 0.412),
   ('Khadija Fahie', 30, 360, 248, 0.69, 118, 51, 0.432),
   ('Olivia Fanning', 23, 380, 262, 0.69, 170, 54, 0.318),
   ('Yarian Fernandez', 11, 370, 297, 0.80, 152, 56, 0.368),
   ('Reganne Flannery', 14, 360, 277, 0.77, 171, 69, 0.404),
   ('N''Dera Francis', 15, 350, 210, 0.60, 181, 53, 0.293),
   ('Brielle Guarente', 10, 380, 287, 0.76, 177, 68, 0.384),
   ('Elanie Herbert', 20, 350, 255, 0.73, 159, 64, 0.403),
   ('Bellisima Lew', 25, 320, 217, 0.68, 176, 46, 0.261),
   ('Elizabeth Lustig', 24, 350, 301, 0.86, 125, 60, 0.480),
   ('Natalie Osorio', 2, 380, 269, 0.71, 122, 48, 0.393),
   ('Sam Osorio', 1, 380, 292, 0.77, 144, 101, 0.701),
   ('Grace Steffen', 21, 360, 259, 0.72, 132, 70, 0.530),
   ('Juliana Vassallo', 22, 310, 247, 0.80, 149, 76, 0.510);