package tema16;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaIO {

	private final static String PATH = "/home/david.cc/Escritorio/foo";

	/*
	 * Crear un el directorio ejemplo1 y el fichero ejemplo1/fichero1.
	 */
	public static void ejercicio01() {
		System.out.println("\n\nTema 16: Java IO/API");
		System.out.println("\nEjercicio 1");

		final String URI1 = PATH+"/ejemplo1/";
		final String URI2 = PATH+"/fichero1";
		Path p1 = Paths.get(URI1);
		Path p2 = Paths.get(URI2);
		Set<PosixFilePermission> perms1 = PosixFilePermissions.fromString("rwxrwxrwx");
		Set<PosixFilePermission> perms2 = PosixFilePermissions.fromString("rw-rw-r--");
		FileAttribute<Set<PosixFilePermission>> attr1 = PosixFilePermissions.asFileAttribute(perms1);
		FileAttribute<Set<PosixFilePermission>> attr2 = PosixFilePermissions.asFileAttribute(perms2);

		System.out.println();
		System.out.println("Creando directorio: " + p1);

		try {
			Files.createDirectory(p1, attr1);
		} catch (FileAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("El directorio ya existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		System.out.println("Creando fichero: " + p2);

		try {
			Files.createFile(p2, attr2);
		} catch (FileAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("El fichero ya existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean existe = Files.exists(p1);
		System.out.println("Files.exists*(" + p1 + ") = " + existe);
		existe = Files.exists(p2);
		System.out.println("Files.exists*(" + p2 + ") = " + existe);

	}

	/**
	 * Escribir una cadena de texto en el fichero y realizar una copia de este
	 */
	public static void ejercicio02() {
		System.out.println("\nEjercicio 2");

		final String URI1 = PATH+"/ejemplo1/fichero1";
		final String URI2 = PATH+"/ejemplo1/copia_fichero1";
		final List<String> TEXTO = Arrays.asList("hola", "hi", "bye");
		Path path = Paths.get(URI1);
		Path copia = Paths.get(URI2);

//		Escribiendo texto
		try {
			Files.write(path, TEXTO, StandardCharsets.UTF_8);
//			Files.writeString(path, "Texto aqui", StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Copiando fichero
		try {
			Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch bgit slock
			e.printStackTrace();
		}

	}

	/*
	 * Crear un nuevo directorio ejemplo2 y mover el fichero copiado a esa
	 * localización.
	 */

	public static void ejercicio03() {
		System.out.println("\nEjercicio 3");

		final String URI1 = PATH+"/ejemplo3/";
		final String URI2 = PATH+"/ejemplo1/copia_fichero1";
		final String URI3 = PATH+"/ejemplo3/copia_fichero1";
		Path p1 = Paths.get(URI1);
		Path origen = Paths.get(URI2);
		Path destino = Paths.get(URI3);
		Set<PosixFilePermission> perms1 = PosixFilePermissions.fromString("rwxrwxrwx");
//		Set<PosixFilePermission> perms2 = PosixFilePermissions.fromString("rw-rw-r--");
		FileAttribute<Set<PosixFilePermission>> attr1 = PosixFilePermissions.asFileAttribute(perms1);
//		FileAttribute<Set<PosixFilePermission>> attr2 = PosixFilePermissions.asFileAttribute(perms2);

		try {
			Files.createDirectory(p1, attr1);
		} catch (FileAlreadyExistsException e) {
			// TODO Auto-generated catch block
			System.out.println("El directorio ya existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Files.move(origen, destino, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	// Mostrar los atributos del fichero copiado y del directorio ejemplo3.
	public static void ejercicio04() {
		System.out.println("\nEjercicio 4");
		
		
		final String ATRIBUTOS = "posix:permissions,owner,size";
		final String URI = PATH+"/ejemplo3/copia_fichero1";
//		final String URI = "/home/david.cc/foo/ejemplo3/copia_fichero1";
		Map<String, Object> mapAtributos;
		Path fichero = Paths.get(URI);
		Path directorio = Paths.get(fichero.getParent().toString());
		
		

		try {
			
			mapAtributos = Files.readAttributes(fichero, ATRIBUTOS);
			System.out.println(fichero);
			System.out.println(mapAtributos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			mapAtributos = Files.readAttributes(directorio, ATRIBUTOS);
			System.out.println(directorio);
			System.out.println(mapAtributos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Crear un enlace simbólico del fichero copiado
	public static void ejercicio05(){

		System.out.println("\nEjercicio 5");

		final String URI1 = PATH+"/ejemplo3/copia_fichero1";
		final String URI2 = PATH+"/enlaceSimbolico";
		final String URI3 = PATH+"/enalceDuro";

		Path fichero = Paths.get(URI1);
		Path enlaceSimbolico = Paths.get(URI2);
		Path enlaceDuro = Paths.get(URI3);

		try {
			Files.createSymbolicLink(enlaceSimbolico, fichero);
			System.out.println(enlaceSimbolico);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Files.createLink(enlaceDuro, fichero);
			System.out.println(enlaceDuro);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
