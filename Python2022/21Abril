import pandas as pd
if __name__ == '__main__':
    df = pd.read_csv("resultadosCovid.csv")
    df = pd.read_csv("resultadosCovid.csv", sep=";", engine="python")

    df_2 = df.drop_duplicates() #3
    #print(df["estado"])  #9
    print(list(df.columns)) #8
    df.loc[[1, 5, 12,36]] #7
    df.loc[10:20] #5

    #dfConIndiceEstado = df.set_index("estado") #2

    df.to_csv("nuevo.csv")

