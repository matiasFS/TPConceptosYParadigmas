herramienta('Taladro inalambrico', 'Juan Perez', '12/05/2023', 1).
herramienta('Sierra circular', 'Maria Gomez', '28/04/2023', 2).
herramienta('Lijadora orbital', 'Carlos Rodriguez', '05/06/2023', 1).
herramienta('Juego de llaves inglesas', 'Laura Torres', '18/03/2023', 1).
herramienta('Destornilladores de precision', 'Ana Silva', '06/02/2023', 3).
herramienta('Martillo perforador', 'Juan Perez', '01/05/2023', 1).
herramienta('Sierra de mano', 'Pedro Lopez', '14/02/2023', 2).
herramienta('Gafas de seguridad', 'Maria Gomez', '22/03/2023', 2).
herramienta('Guantes de trabajo', 'Juan Perez', '09/05/2023', 2).
herramienta('Alicate de corte diagonal', 'Laura Torres', '27/04/2023', 1).
herramienta('Amoladora angular', 'Carlos Rodriguez', '04/05/2023', 1).
herramienta('Mascara respiratoria', 'Juan Perez', '17/02/2023', 3).
herramienta('Casco de seguridad', 'Maria Gomez', '25/03/2023', 1).
herramienta('Cinturon porta herramientas', 'Ana Silva', '08/04/2023', 1).
herramienta('Taladro inalambrico', 'Pedro Lopez', '10/06/2023', 1).
herramienta('Lijadora orbital', 'Laura Torres', '16/05/2023', 1).
herramienta('Sierra circular', 'Juan Perez', '21/03/2023', 2).
herramienta('Destornilladores de precision', 'Carlos Rodriguez', '30/04/2023', 3).
herramienta('Juego de llaves inglesas', 'Maria Gomez', '05/02/2023', 1).
herramienta('Martillo perforador', 'Ana Silva', '12/05/2023', 1).
herramienta('Sierra de mano', 'Juan Perez', '27/03/2023', 2).
herramienta('Alicate de corte diagonal', 'Pedro Lopez', '04/04/2023', 1).
herramienta('Amoladora angular', 'Laura Torres', '14/06/2023', 1).
herramienta('Gafas de seguridad', 'Carlos Rodriguez', '20/03/2023', 1).
herramienta('Guantes de trabajo', 'Maria Gomez', '29/04/2023', 2).
herramienta('Mascara respiratoria', 'Juan Perez', '02/05/2023', 1).
herramienta('Casco de seguridad', 'Ana Silva', '11/02/2023', 1).
herramienta('Cinturon porta herramientas', 'Pedro Lopez', '26/04/2023', 1).
herramienta('Taladro inalambrico', 'Carlos Rodriguez', '07/03/2023', 1).


ventas(Articulo, Cantidad) :-
    findall(C, herramienta(Articulo, _, _, C), Cantidades),
    sum_list(Cantidades, Cantidad).

articulo_menos_vendido(Articulos) :-
    findall(Cantidad-Articulo, (herramienta(Articulo, _, _, _), ventas(Articulo, Cantidad)), Ventas),
    keysort(Ventas, [MenorCantidad-_|_]),
    findall(Art, (member(Cantidad-Art, Ventas), ventas(Art, MenorCantidad)), ArticulosSinDuplicados),
    sort(ArticulosSinDuplicados, Articulos).
